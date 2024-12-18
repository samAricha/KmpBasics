package com.teka.kmp_sample

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.room.RoomDatabase
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import com.teka.kmp_sample.data_layer.database.PeopleDatabase
import com.teka.kmp_sample.data_layer.entities.PersonEntity
import com.teka.kmp_sample.dependencies.MyViewModel
import com.teka.kmp_sample.navigation.NavGraph
import com.teka.kmp_sample.ui.theme.AppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.compose.KoinContext
import org.koin.compose.viewmodel.koinViewModel

@Composable
@Preview
fun App(db: PeopleDatabase) {

    val navController: NavHostController = rememberNavController()
    AppTheme {
        NavGraph(navController = navController)
    }


//    val db = getDbInstance(builder)
//    val peopleDao = db.peopleDao()
//
//    AppTheme {
//
//        KoinContext {
//            NavHost(
//                navController = rememberNavController(),
//                startDestination = "home"
//            ) {
//                composable(route = "home") {
//                    val viewModel = koinViewModel<MyViewModel>()
////                    Box(
////                        modifier = Modifier
////                            .fillMaxSize(),
////                        contentAlignment = Alignment.Center
////                    ) {
////                        Text(
////                            text = viewModel.getHelloWorldString()
////                        )
////                    }
//
//
//                    val people by peopleDao.getAllPeople().collectAsState(initial = emptyList())
//                    val scope = rememberCoroutineScope()
//
//                    LaunchedEffect(true) {
//                        val peopleList = listOf(
//                            PersonEntity(name = "Aricha"),
//                            PersonEntity(name = "Samson"),
//                            PersonEntity(name = "Momanyi"),
//                        )
//                        peopleList.forEach {
//                            peopleDao.upsert(it)
//                        }
//                    }
//
//
//                    LazyColumn(
//                        modifier = Modifier
//                            .fillMaxSize(),
//                        contentPadding = PaddingValues(16.dp),
//                    ) {
//                        items(people) { person ->
//                            Text(
//                                text = person.name,
//                                modifier = Modifier
//                                    .fillMaxWidth()
//                                    .clickable {
//                                        scope.launch {
//                                            peopleDao.delete(person)
//                                        }
//                                    }
//                                    .padding(16.dp)
//                            )
//                        }
//                    }
//
//
//                }
//            }
//        }
//
//    }
}








fun getDbInstance(
    builder: RoomDatabase.Builder<PeopleDatabase>
): PeopleDatabase {
    return builder
//        .addMigrations()
//        .fallbackToDestructiveMigrationOnDowngrade()
        .setDriver(BundledSQLiteDriver())
        .setQueryCoroutineContext(Dispatchers.IO)
        .build()
}