package com.example.projectmulumbatwo

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.SurfaceHolder
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.projectmulumbatwo.databinding.ActivityScannerBinding
import com.google.android.gms.vision.CameraSource
import com.google.android.gms.vision.Detector
import com.google.android.gms.vision.barcode.Barcode
import com.google.android.gms.vision.barcode.BarcodeDetector
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import java.io.IOException



class ScannerActivity : AppCompatActivity() {
    lateinit var binding: ActivityScannerBinding
    lateinit var barcodeDetector: BarcodeDetector
    var intentData = ""
    lateinit var cameraSource: CameraSource
    lateinit var firestore: FirebaseFirestore
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScannerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firestore = FirebaseFirestore.getInstance()


    }
    private fun iniBc(){
        barcodeDetector= BarcodeDetector.Builder(this)
            .setBarcodeFormats(Barcode.ALL_FORMATS)
            .build()
        cameraSource= CameraSource.Builder(this,barcodeDetector)
            .setRequestedPreviewSize(1920,1080)
            .setAutoFocusEnabled(true)
            .setFacing(CameraSource.CAMERA_FACING_BACK)
            .build()

        binding.surfaceview!!.holder.addCallback(object : SurfaceHolder.Callback{
            @SuppressLint("MissingPermission")
            override fun surfaceCreated(p0: SurfaceHolder) {
                try{
                    cameraSource.start(binding.surfaceview!!.holder)
                }catch (e: IOException) {
                    e.printStackTrace()
                }
            }

            override fun surfaceChanged(p0: SurfaceHolder, p1: Int, p2: Int, p3: Int) {

            }

            override fun surfaceDestroyed(p0: SurfaceHolder) {
                cameraSource.stop()
            }

        })
        barcodeDetector.setProcessor(object : Detector.Processor<Barcode> {
            override fun release() {
                Toast.makeText(
                    applicationContext, "barcode scanner has been stopped",
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun receiveDetections(p0: Detector.Detections<Barcode>) {
                var barcodes = p0.detectedItems
                if (barcodes.size()!=0){
                    binding.txtBarcodeValue!!.post{
                        binding.btnAction.text="SEARCH ITEM"
                        intentData=barcodes.valueAt(0).displayValue
                        binding.txtBarcodeValue.setText(intentData)


                        var intent= Intent(this@ScannerActivity, CartActivity::class.java)
                        startActivity(intent)
                        finish()
                    }
                }
            }
        } )
    }

    override fun onPause() {
        super.onPause()
        cameraSource!!.release()
    }

    override fun onResume() {
        super.onResume()
        iniBc()
    }

}
