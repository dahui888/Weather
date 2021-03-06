package com.wjx.android.weather.module.chooseplace.repository

import androidx.lifecycle.MutableLiveData
import com.wjx.android.weather.base.repository.ApiRepository
import com.wjx.android.weather.common.RoomHelper
import com.wjx.android.weather.common.state.State
import com.wjx.android.weather.model.ChoosePlaceData
import com.wjx.android.weather.model.Place

/**
 * Created with Android Studio.
 * Description:
 * @author: Wangjianxian
 * @CreateDate: 2020/6/4 20:22
 */
class ChoosePlaceRepository(var loadState: MutableLiveData<State>) : ApiRepository() {
    suspend fun queryAllPlace() = RoomHelper.queryAllPlace(loadState)
    suspend fun queryAllChoosePlace() = RoomHelper.queryAllChoosePlace(loadState)
    suspend fun deletePlace(place: Place?) = RoomHelper.deletePlace(place)
    suspend fun deleteChoosePlace(choosePlaceData: ChoosePlaceData) =
        RoomHelper.deleteChoosePlace(choosePlaceData)

    suspend fun deleteAll() = RoomHelper.deleteAll()
    suspend fun loadRealtimeWeather(lng: String?, lat: String?) =
        apiService.loadRealtimeWeather(lng, lat)
}