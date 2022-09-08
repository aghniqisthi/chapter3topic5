package com.example.chapter3topic5.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chapter3topic5.R
import kotlinx.android.synthetic.main.activity_main_prov.*

class MainProvActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_prov)

        val listProv = arrayListOf(
            //sumatra
            ListProvinsi("Nanggroe Aceh Darussalam", "Banda Aceh", R.drawable.aceh),
            ListProvinsi("Sumatra Utara", "Medan", R.drawable.sumut),
            ListProvinsi("Sumatra Selatan", "Palembang", R.drawable.sumsel),
            ListProvinsi("Sumatra Barat", "Padang", R.drawable.sumbar),
            ListProvinsi("Bengkulu", "Bengkulu", R.drawable.bengkulu),
            ListProvinsi("Riau", "Pekanbaru", R.drawable.riau),
            ListProvinsi("Kepulauan Riau", "Tanjung Pinang", R.drawable.kepri),
            ListProvinsi("Jambi", "Jambi", R.drawable.jambi),
            ListProvinsi("Lampung", "Bandar Lampung", R.drawable.lampung),
            ListProvinsi("Bangka Belitung", "Pangkal Pinang", R.drawable.bangkabelitung),

            //kalimantan
            ListProvinsi("Kalimantan Timur", "Samarinda", R.drawable.kaltim),
            ListProvinsi("Kalimantan Barat", "Pontianak", R.drawable.kalbar),
            ListProvinsi("Kalimantan Tengah", "Palangkaraya", R.drawable.kalteng),
            ListProvinsi("Kalimantan Selatan", "Banjarbaru ", R.drawable.kalsel),
            ListProvinsi("Kalimantan Utara", "Tanjung Selor", R.drawable.kalut),

            //jawa
            ListProvinsi("DKI Jakarta", "Jakarta", R.drawable.dki),
            ListProvinsi("Banten", "Serang", R.drawable.banten),
            ListProvinsi("Jawa Barat", "Bandung", R.drawable.jabar),
            ListProvinsi("Jawa Tengah", "Semarang", R.drawable.jateng),
            ListProvinsi("Jawa Timur", "Surabaya", R.drawable.jatim),
            ListProvinsi("DI Yogyakarta", "Yogyakarta", R.drawable.diy),

            //ntb
            ListProvinsi(" Bali", "Denpasar", R.drawable.bali),
            ListProvinsi("Nusa Tenggara Barat", "Mataram", R.drawable.ntb),
            ListProvinsi("Nusa Tenggara Timur", "Kupang", R.drawable.ntt),

            //sulawesi
            ListProvinsi("Sulawesi Tenggara", "Palu", R.drawable.sulteng),
            ListProvinsi("Sulawesi Barat", "Mamuju", R.drawable.sulbar),
            ListProvinsi("Sulawesi Tengah", "Kendari", R.drawable.sulteng),
            ListProvinsi("Sulawesi Selatan", "Makassar ", R.drawable.sumsel),
            ListProvinsi("Sulawesi Utara", "Manado", R.drawable.sulut),
            ListProvinsi("Gorontalo", "Gorontalo", R.drawable.gorontalo),

            //maluku
            ListProvinsi("Maluku Utara", "Sofifi", R.drawable.malukuutara),
            ListProvinsi("Maluku", "Ambon", R.drawable.maluku),

            //papua
            ListProvinsi("Papua Barat", "Manokwari", R.drawable.papbar),
            ListProvinsi("Papua", "Jayapura", R.drawable.papua),
            ListProvinsi("Papua Selatan", "Kabupaten Merauke", R.drawable.papsel),
            ListProvinsi("Papua Tengah", "Kabupaten Nabire", R.drawable.papteng),
            ListProvinsi("Papua Pegunungan", "Kabupaten Jayawijaya", R.drawable.papuakariwari)
            )

        val adapterProv = ProvinsiAdapter(listProv)
        val layoutmanager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        rvProv.adapter = adapterProv
        rvProv.layoutManager = layoutmanager
    }
}