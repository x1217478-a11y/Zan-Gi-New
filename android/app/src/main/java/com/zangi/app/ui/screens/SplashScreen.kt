package com.zangi.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zangi.app.ui.theme.ZanGiPrimary
import com.zangi.app.ui.theme.ZanGiSecondary
import com.zangi.app.ui.theme.ZanGiTertiary
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(onFinished: () -> Unit) {
    LaunchedEffect(Unit) {
        delay(1200) // Brief polished launch sequence
        onFinished()
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Zan-Gi",
                fontSize = 44.sp,
                fontWeight = FontWeight.ExtraBold,
                style = MaterialTheme.typography.displayLarge.copy(
                    brush = Brush.horizontalGradient(listOf(ZanGiPrimary, ZanGiSecondary, ZanGiTertiary))
                )
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Connect. Create. Imagine. Earn.",
                fontSize = 14.sp,
                color = Color(0xFF64748B),
                fontWeight = FontWeight.Medium
            )
        }
    }
}

@Composable
fun OnboardingScreen(
    onComplete: () -> Unit,
    onLanguageToggled: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(24.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(32.dp))

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "স্বাগতম Zan-Gi তে",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Welcome to the AI-First Social Universe",
                fontSize = 16.sp,
                color = Color(0xFF64748B),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Zan-Gi integrates Bengali & English AI creation, smart feed discovery, community spaces, and responsible creator monetization.",
                fontSize = 14.sp,
                lineHeight = 22.sp,
                color = Color(0xFF334155),
                textAlign = TextAlign.Center
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = onComplete,
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .height(48.dp),
                colors = ButtonDefaults.buttonColors(containerColor = ZanGiPrimary)
            ) {
                Text("শুরু করুন / Get Started", fontWeight = FontWeight.SemiBold)
            }
            Spacer(modifier = Modifier.height(12.dp))
            OutlinedButton(
                onClick = onLanguageToggled,
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .height(48.dp)
            ) {
                Text("ভাষা পরিবর্তন / Toggle Language")
            }
        }
    }
}
