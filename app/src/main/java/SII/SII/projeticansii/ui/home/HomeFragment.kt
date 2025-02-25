package SII.SII.projeticansii.ui.home

import SII.SII.projeticansii.databinding.FragmentHomeBinding
import android.content.Context
import android.media.AudioAttributes
import android.os.Build
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private var VIBRATION_DURATION = 200L
    private var SILENCE_DURATION = 50L

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root


        binding.buttonVibration1.setOnClickListener {
            val vibrator = requireActivity().getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            val timings = longArrayOf(VIBRATION_DURATION) // Dash
            val amplitudes = intArrayOf(
                VibrationEffect.DEFAULT_AMPLITUDE)
            val vibrationEffect = VibrationEffect.createWaveform(timings, amplitudes, -1)
            val audioAttributes = AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_ALARM)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build()
            vibrator.vibrate(vibrationEffect, audioAttributes)
        }

        binding.buttonVibration2.setOnClickListener {
            val vibrator = requireActivity().getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            val timings = longArrayOf(VIBRATION_DURATION, SILENCE_DURATION, VIBRATION_DURATION, SILENCE_DURATION, VIBRATION_DURATION) //
            val amplitudes = intArrayOf(
                VibrationEffect.DEFAULT_AMPLITUDE, 0, VibrationEffect.DEFAULT_AMPLITUDE, 0, VibrationEffect.DEFAULT_AMPLITUDE
            )
            val vibrationEffect = VibrationEffect.createWaveform(timings, amplitudes, -1)
            val audioAttributes = AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_ALARM)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build()
            vibrator.vibrate(vibrationEffect, audioAttributes)
        }
        binding.buttonVibration3.setOnClickListener {
            val vibrator = requireActivity().getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            val timings = longArrayOf(VIBRATION_DURATION, SILENCE_DURATION, VIBRATION_DURATION) //
            val amplitudes = intArrayOf(
                VibrationEffect.DEFAULT_AMPLITUDE, 0, VibrationEffect.DEFAULT_AMPLITUDE
            )
            val vibrationEffect = VibrationEffect.createWaveform(timings, amplitudes, -1)
            val audioAttributes = AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_ALARM)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build()
            vibrator.vibrate(vibrationEffect, audioAttributes)
        }

        binding.buttonVibration4.setOnClickListener {
            val vibrator = requireActivity().getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            val timings = longArrayOf(VIBRATION_DURATION, SILENCE_DURATION, VIBRATION_DURATION, SILENCE_DURATION, VIBRATION_DURATION, SILENCE_DURATION, VIBRATION_DURATION) //
            val amplitudes = intArrayOf(
                VibrationEffect.DEFAULT_AMPLITUDE, 0, VibrationEffect.DEFAULT_AMPLITUDE, 0, VibrationEffect.DEFAULT_AMPLITUDE, 0, VibrationEffect.DEFAULT_AMPLITUDE
            )
            val vibrationEffect = VibrationEffect.createWaveform(timings, amplitudes, -1)
            val audioAttributes = AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_ALARM)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build()
            vibrator.vibrate(vibrationEffect, audioAttributes)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}