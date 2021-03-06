package com.example.secondseminar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.secondseminar.recycler.InstaAdapter
import com.example.secondseminar.recycler.InstaData
import com.example.secondseminar.recycler.VerticalItemDecorator
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {
    lateinit var instaAdapter : InstaAdapter
    val datas = mutableListOf<InstaData>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        instaAdapter =
            InstaAdapter(view.context)
        rv_home.run {
            adapter = instaAdapter
            layoutManager = LinearLayoutManager(view.context,LinearLayoutManager.VERTICAL,false)
            addItemDecoration(
                VerticalItemDecorator(
                    24
                )
            )
        }
        loadDatas()
    }
    private fun loadDatas(){
        datas.apply {
            add(
                InstaData(
                    name = "최호준",
                    img_url = "https://cdn.pixabay.com/photo/2020/03/15/11/06/landscape-4933256__340.jpg",
                    img_profile = "https://cdn.pixabay.com/photo/2016/12/27/06/38/albert-einstein-1933340__340.jpg"
                )
            )
            add(
                InstaData(
                    name = "안드로이드",
                    img_url = "https://cdn.pixabay.com/photo/2020/03/15/09/56/rest-4933097__340.jpg",
                    img_profile = "https://cdn.pixabay.com/photo/2016/02/14/19/37/person-1200012__340.jpg"
                )
            )
            add(
                InstaData(
                    name = "파트장",
                    img_url = "https://cdn.pixabay.com/photo/2020/03/13/11/57/tulips-4927755__340.jpg",
                    img_profile = "https://cdn.pixabay.com/photo/2018/04/19/21/17/panda-3334356__340.jpg"
                )
            )
        }
        instaAdapter.data = datas
        instaAdapter.notifyDataSetChanged()
    }
}
