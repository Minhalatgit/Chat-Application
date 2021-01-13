package com.example.chatapplication;

import com.example.chatapplication.notifications.MyResponse;
import com.example.chatapplication.notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAttwA9CY:APA91bGHrZgdWQl0dHoAgvmz20482q_iyTnPiQKckHZUAcWIpVzIfgFXb2_PQOmmDjLgWnuNkMHF3yyFusj5WU8EaHhVx3smneMM6PtSO1CohYFmFsm3cbmtIdkFUPNn3oIv9fMOk-ZM"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
