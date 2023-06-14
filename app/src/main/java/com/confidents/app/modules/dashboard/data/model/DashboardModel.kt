package com.confidents.app.modules.dashboard.`data`.model

import com.confidents.app.R
import com.confidents.app.appcomponents.di.MyApp
import kotlin.String

data class DashboardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSelamatDatang: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_selamat_datang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFulanbinFulan: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_fulan_bin_fulan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEarlyprotectio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_keep_your_teeth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTopDoctor: String? = MyApp.getInstance().resources.getString(R.string.lbl_nearest_doctor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeall: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHealtarticle: String? = MyApp.getInstance().resources.getString(R.string.lbl_article)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeallOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etSearchValue: String? = null
)
