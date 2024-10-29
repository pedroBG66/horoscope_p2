package com.example.horoscopo.data

import com.example.horoscopo.R

class HoroscopeProvider {
    companion object{

        private val horoscopeList : List<Horoscope> = listOf(
            Horoscope("aries", R.string.horoscope_name_aries, R.string.horoscope_date_aries, R.drawable.icon_aries),
            Horoscope("taurus", R.string.horoscope_name_taurus, R.string.horoscope_date_taurus, R.drawable.icon_tauro),
            Horoscope("gemini", R.string.horoscope_name_gemini, R.string.horoscope_date_gemini, R.drawable.icon_gemini),
            Horoscope("cancer", R.string.horoscope_name_cancer, R.string.horoscope_date_cancer, R.drawable.icon_cancer),
            Horoscope("leo", R.string.horoscope_name_leo, R.string.horoscope_date_leo, R.drawable.icon_leo),
            Horoscope("virgo", R.string.horoscope_name_virgo, R.string.horoscope_date_virgo, R.drawable.icon_virgo),
            Horoscope("libra", R.string.horoscope_name_libra, R.string.horoscope_date_libra, R.drawable.icon_libra),
            Horoscope("scorpio", R.string.horoscope_name_scorpio, R.string.horoscope_date_scorpio, R.drawable.icon_escorpio),
            Horoscope("sagittarius", R.string.horoscope_name_sagittarius, R.string.horoscope_date_sagittarius, R.drawable.icon_sagitario),
            Horoscope("capricorn", R.string.horoscope_name_capricorn, R.string.horoscope_date_capricorn, R.drawable.icon_capri),
            Horoscope("aquarius", R.string.horoscope_name_aquarius, R.string.horoscope_date_aquarius, R.drawable.icon_aquarius),
            Horoscope("pisces", R.string.horoscope_name_pisces, R.string.horoscope_date_pisces, R.drawable.icon_piscis)
        )

        fun findAll(): List<Horoscope> {

            return horoscopeList
        }

        fun findById(id:String): Horoscope {

            return horoscopeList.find { it.id == id } !!

        }
    }

}