package com.example.footschedule.view.search

import com.arellomobile.mvp.MvpPresenter
import com.example.footschedule.data.SharedData
import com.example.footschedule.data.model.CountryItems

class SearchPresenter : MvpPresenter<SearchView>() {
    //val listEvents: MutableLiveData<EventData> = MutableLiveData()
    //val statusResponse: MutableLiveData<String> = MutableLiveData()

    //private val modelEventsHelper: ModelEventsHelper = ModelEventsHelper(listEvents, statusResponse)

    fun fillScreen(): List<CountryItems> {
        return mutableListOf(
            CountryItems("Топ матчи сегодня", "https://asiajusticemarathon.org/wp-content/uploads/2017/08/International_Flag_of_Planet_Earth_05.jpg", "Мир", SharedData.WORLD_KEY),
            CountryItems("Россия", "https://www.ros-color.ru/storage/post/34/344b0ad1ab5c2bdef84d854e51b28b8c.jpeg", "Российская премьер лига", SharedData.RUSSIA_KEY),
            CountryItems("Англия", "https://urokangl.ru/wp-content/uploads/2019/01/england-flag.jpg", "Премьер лига", SharedData.ENGLAND_KEY),
            CountryItems("Италия", "https://ak8.picdn.net/shutterstock/videos/20309968/thumb/1.jpg", "Серия А", SharedData.ITALY_KEY),
            CountryItems("Испания", "https://phonoteka.org/uploads/posts/2021-11/1635885258_6-phonoteka-org-p-flag-ispanii-fon-krasivie-7.jpg", "Ла Лига", SharedData.SPAIN_KEY),
            CountryItems("Германия", "https://tbivision.com/files/2017/01/Germany-flag.jpeg", "Бундеслига", SharedData.GERMANY_KEY),
            CountryItems("Украина", "https://regnum.ru/uploads/pictures/news/2016/05/08/regnum_picture_1462717070663900_normal.jpg", "Чемпионат Украины", SharedData.UKRAINE_KEY),
            CountryItems("Франция", "https://militaryarms.ru/wp-content/uploads/2021/08/19C-1.jpg", "Лига 1", SharedData.FRANCE_KEY),
            CountryItems("Турция", "https://vseprotunis.ru/wp-content/uploads/8541245.jpg", "Высшая лига", SharedData.TURKEY_KEY)
        )
    }
}