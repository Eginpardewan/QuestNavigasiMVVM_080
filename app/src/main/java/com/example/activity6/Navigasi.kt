package com.example.activity6

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.activity6.model.DataJk
import com.example.activity6.ui.theme.view.FormulirView
import com.example.activity6.ui.theme.view.TampilData
import com.example.activity6.ui.theme.view.TampilMahasiswaView
import com.example.activity6.ui.theme.viewmodel.MahasiswaViewModel

enum class  Halaman{
    Form,
    Data
}
