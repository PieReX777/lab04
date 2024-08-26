package com.example.androidlab04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridItemScope
import androidx.compose.foundation.lazy.grid.LazyGridScope
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidlab04.ui.theme.Androidlab04Theme
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Checkbox


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Androidlab04Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)

                    )
                    MyLazyColumn()
                    MyLazyRow()
                    MyGrid()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
@Composable
fun MyLazyColumn() {
    LazyColumn {
        items(10) { index ->
            Text(text = "Item $index")
        }
    }
}

@Composable
fun MyLazyRow() {
    LazyRow {
        items(5) { index ->
            Card(
                modifier = Modifier.padding(8.dp),
            ) {
                Text(text = "Card $index")
            }
        }
    }
}
@Composable
fun MyGrid() {
    val gridItems = List(9) { index -> "Item $index" }
    LazyVerticalGrid(cells = GridCells.Fixed(3)) {
        items(gridItems) { item ->
            Card(
                modifier = Modifier.padding(8.dp),
            ) {
                Checkbox(
                    checked = false,
                    onCheckedChange = { /* Handle checkbox state */ }
                )
            }
        }
    }
}

fun Checkbox(checked: Boolean, onCheckedChange: (Boolean) -> Unit, interactionSource: () -> Unit) {

}

fun items(gridItems: List<String>, function: @Composable() (LazyGridItemScope.(index: Int) -> Unit)) {
    TODO("Not yet implemented")
}

fun LazyVerticalGrid(cells: Any, function: LazyGridScope.() -> Unit) {
    TODO("Not yet implemented")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Androidlab04Theme {
        Greeting("Android")
    }
}