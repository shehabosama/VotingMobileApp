package com.example.voting.Ui.Activities.ElectionLogin;

import android.content.Context;

public interface ElectionLoginContract {

    interface Model {
        interface onFinishedListener {
            void onFinished(String result);

            void onFailuer(Throwable t);

        }
    }

    interface View {
        void showProgress();

        void hideProgress();
    }

    interface Presenter {
        void performElectionLogin(String registerCode , Context context);
    }

}
