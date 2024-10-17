package com.example.frontendcarproxyasistance

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.viewmodel.CreationExtras.Empty.map
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.material.navigation.NavigationView

 abstract class MainActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        drawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        navView.setNavigationItemSelectedListener {
        when (it.itemId) {
            R.id.nav_login -> startActivity(Intent(this, UserLoginActivity::class.java))
            R.id.nav_landing_page -> startActivity(Intent(this, LandingPageActivity::class.java))
            R.id.nav_profile -> startActivity(Intent(this, UserProfileActivity::class.java))
            R.id.nav_setting -> startActivity(Intent(this, SettingActivity::class.java))
            R.id.nav_triggers -> startActivity(Intent(this, SetTriggersActivity::class.java))
            //R.id.nav_history -> { /* Handle history */ }
        }
            drawerLayout.closeDrawers()
            true
        }
//Initialize map
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

    }

    fun OnMapReady(googleMap:GoogleMap) {
        map = googleMap
        val currentLocation = LatLng(40.7128, -74.0060)
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 12f))
    }
}