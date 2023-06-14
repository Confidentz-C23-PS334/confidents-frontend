package com.confidents.app.modules.tos.`data`.model

import com.confidents.app.R
import com.confidents.app.appcomponents.di.MyApp
import kotlin.String

data class TosModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTermsofServic: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terms_of_servic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_website_terms_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSayaSudahmemb: String? =
      MyApp.getInstance().resources.getString(R.string.msg_saya_sudah_memb)

)
