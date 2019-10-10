//package com.example.jetpack.ui
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.Menu
//import android.view.MenuItem
//import androidx.appcompat.app.ActionBarDrawerToggle
//import androidx.appcompat.widget.Toolbar
//import androidx.core.view.GravityCompat
//import androidx.drawerlayout.widget.DrawerLayout
//import androidx.navigation.NavController
//import androidx.navigation.Navigation
//import androidx.navigation.findNavController
//import androidx.navigation.ui.*
//import com.example.jetpack.R
//import com.google.android.material.floatingactionbutton.FloatingActionButton
//import com.google.android.material.navigation.NavigationView
//import com.google.android.material.snackbar.Snackbar
//import kotlinx.android.synthetic.main.activity_home.*
//import kotlinx.android.synthetic.main.app_bar_main.*
//
//class HomeActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
//
//
//
//    private lateinit var navController: NavController
//    private lateinit var appBarConfiguration: AppBarConfiguration
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_home)
//
//
//        val toolbar: Toolbar = findViewById(R.id.toolbar)
//        setSupportActionBar(toolbar)
//
//        val fab: FloatingActionButton = findViewById(R.id.fab)
//        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
//        }
//        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
//        val navView: NavigationView = findViewById(R.id.nav_view)
//        val toggle = ActionBarDrawerToggle(
//            this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
//        )
//        drawerLayout.addDrawerListener(toggle)
//        toggle.syncState()
//
//        navView.setNavigationItemSelectedListener(this)
//
//        navController= Navigation.findNavController(this,R.id.nav_fragment)
//
//        /**
//         *  关联DrawerLayout
//        DrawerLayout与NavController的关联包含两方面
//
//        NavigationView中菜单与Navigation Graph的关联
//        ActionBar中navigation button的显示以及up事件的处理
//        关联菜单同样类似于options menu，只需要保持id一致然后调用如下关联代码即可
//
//         */
//        nav_view.setupWithNavController(navController)
//
//        /**
//         *  关联BottomNavigationView
//        要求底部导航栏类型为com.google.android.material.bottomnavigation.BottomNavigationView，与options menu类似，res/menu中的menu id与Navigation Graph中定义的destination的id需要保持一致，然后在AppCompatActivity中关联NavController即可
//
//         */
//        bnv_bottom.setupWithNavController(navController)
//
//        /**
//         *  关联ActionBar
//        点击ActionBar上菜单然后跳转到对应的destination，首先需要destination和res/menu/中菜单的id相同，然后在代码中建立关联
//         */
//        /**
//         *  而ActionBar中navigation button的显示则由AppBarConfiguration类控制，该类用于配置ActionBar是否需要支持DrawerLayout以及指定哪些destination为top level。
//        当支持DrawerLayout时，ActionBar中的Navigation Button位于top level界面时显示drawer图标，其它界面显示返回图标。
//
//        如下代码表示ActionBar需要支持DrawerLayout，并且home_dest和deeplink_dest为top level界面。
//         */
////        appBarConfiguration= AppBarConfiguration(setOf(R.id.launchFragment,R.id.mainFragment,R.id.loginFragment),drawerLayout)
//
//        /**
//         * 而如下代码则表示ActionBar不需要支持DrawerLayout，当界面位于Navigation Graph的start destination时ActionBar不需要显示Navigation Button，跳转后的界面则显示返回图标。
//         */
//        appBarConfiguration= AppBarConfiguration(navController.graph)
//
//        setupActionBarWithNavController(navController,appBarConfiguration)
//    }
//
//    /**
//     * 针对ActionBar上的返回，通常需要手动控制返回事件
//     */
//    override fun onSupportNavigateUp(): Boolean {
//        return navController.navigateUp(appBarConfiguration)
//    }
//
//
//
//    override fun onBackPressed() {
//        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
//        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
//            drawerLayout.closeDrawer(GravityCompat.START)
//        } else {
//            super.onBackPressed()
//        }
//    }
//
//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        menuInflater.inflate(R.menu.main, menu)
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
////        return when (item.itemId) {
////            R.id.mainFragment -> true
////            else -> super.onOptionsItemSelected(item)
////        }
//        /**
//         * 处理options menu事件时，优先交给NavController处理
//         */
//        return item.onNavDestinationSelected(findNavController(R.id.nav_fragment))||super.onOptionsItemSelected(item)
//    }
//
//    override fun onNavigationItemSelected(item: MenuItem): Boolean {
//        // Handle navigation view item clicks here.
//        when (item.itemId) {
////            R.id.nav_home -> {
////                // Handle the camera action
////            }
////            R.id.nav_gallery -> {
////
////            }
////            R.id.nav_slideshow -> {
////
////            }
//            R.id.nav_tools -> {
//
//            }
//            R.id.nav_share -> {
//
//            }
//            R.id.nav_send -> {
//
//            }
//        }
//        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
//        drawerLayout.closeDrawer(GravityCompat.START)
//        return true
//    }
//}
