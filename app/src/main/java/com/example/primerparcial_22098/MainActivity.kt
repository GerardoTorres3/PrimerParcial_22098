package com.example.primerparcial_22098

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun ChessBoard() {
    Column {
        // Fila 1
        Row {
            Box(modifier = Modifier
                .background(Color(0xFF4CAF50))
                .size(50.dp))

            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp))

            Box(modifier = Modifier
                .background(Color(0xFF4CAF50))
                .size(50.dp))

            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp))

            Box(modifier = Modifier
                .background(Color(0xFF4CAF50))
                .size(50.dp)){
                Image(
                    painter = painterResource(id = R.drawable.black_king),
                    contentDescription = "Black King",
                    modifier = Modifier.size(50.dp))




            }}

        Row {
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)){
                Image(
                    painter = painterResource(id = R.drawable.black_rook),
                    contentDescription = "Black Roock",
                    modifier = Modifier.size(50.dp))}

            Box(modifier = Modifier
                .background(Color(0xFF4CAF50))
                .size(50.dp))

            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)){
                Image(
                    painter = painterResource(id = R.drawable.black_pawn),
                    contentDescription = "Black Pawn",
                    modifier = Modifier.size(50.dp))}

            Box(modifier = Modifier
                .background(Color(0xFF4CAF50))
                .size(50.dp)){
                Image(
                    painter = painterResource(id = R.drawable.black_pawn),
                    contentDescription = "Black Pawn",
                    modifier = Modifier.size(50.dp))}

            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)){
                Image(
                    painter = painterResource(id = R.drawable.black_pawn),
                    contentDescription = "Black Pawn",
                    modifier = Modifier.size(50.dp))




            }}
        Row {
            Box(modifier = Modifier
                .background(Color(0xFF4CAF50))
                .size(50.dp))

            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp))

            Box(modifier = Modifier
                .background(Color(0xFF4CAF50))
                .size(50.dp))

            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp))

            Box(modifier = Modifier
                .background(Color(0xFF4CAF50))
                .size(50.dp))
        }
        Row {
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp))

            Box(modifier = Modifier
                .background(Color(0xFF4CAF50))
                .size(50.dp)){
                Image(
                    painter = painterResource(id = R.drawable.white_queen),
                    contentDescription = "White Queen",
                    modifier = Modifier.size(50.dp))}

            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp))

            Box(modifier = Modifier
                .background(Color(0xFF4CAF50))
                .size(50.dp))

            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp))
        }
        Row {
            Box(modifier = Modifier
                .background(Color(0xFF4CAF50))
                .size(50.dp))

            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp))

            Box(modifier = Modifier
                .background(Color(0xFF4CAF50))
                .size(50.dp)){
                Image(
                    painter = painterResource(id = R.drawable.white_pawn),
                    contentDescription = "White Pawn",
                    modifier = Modifier.size(50.dp))}

            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)){
                Image(
                    painter = painterResource(id = R.drawable.white_pawn),
                    contentDescription = "White Pawn",
                    modifier = Modifier.size(50.dp))}

            Box(modifier = Modifier
                .background(Color(0xFF4CAF50))
                .size(50.dp)){
                Image(
                    painter = painterResource(id = R.drawable.white_pawn),
                    contentDescription = "White Pawn",
                    modifier = Modifier.size(50.dp))}
        }
        Row {
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp))

            Box(modifier = Modifier
                .background(Color(0xFF4CAF50))
                .size(50.dp))

            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp))

            Box(modifier = Modifier
                .background(Color(0xFF4CAF50))
                .size(50.dp))

            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)){
                Image(
                    painter = painterResource(id = R.drawable.whie_king),
                    contentDescription = "White King",
                    modifier = Modifier.size(50.dp))}

        }
        Text(
            text = "Anatoly Karpov vs Gary Kasparov",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(8.dp))

        Text(
            text = "Rusia 1923",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(8.dp),
            fontStyle = FontStyle.Italic
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Botones "Soy blancas" y "Soy negras"
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            Box(modifier = Modifier
                .clickable { /* acción para "Soy blancas" */ }
                .padding(8.dp)
                .padding(horizontal = 16.dp, vertical = 8.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Juegan Blancas", fontWeight = FontWeight.Bold, fontSize = 16.sp)
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Botones "Soy blancas" y "Soy negras"
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                Box(modifier = Modifier
                    .clickable { /* acción para "Soy blancas" */ }
                    .padding(8.dp)
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "Juegan Negras", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                }


            }







}
        Spacer(modifier = Modifier.height(16.dp))

        // Botón "Reiniciar"
        Box(
            modifier = Modifier
                .clickable { /* acción para reiniciar el juego */ }
                .fillMaxWidth()
                .padding(8.dp)
                .background(Color.Red)
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Text("Reiniciar", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
        }}}






