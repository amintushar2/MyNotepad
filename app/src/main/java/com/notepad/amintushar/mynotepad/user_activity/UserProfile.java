package com.notepad.amintushar.mynotepad.user_activity;


    public class UserProfile {

        public String userEmail;
        public String userName;

        public UserProfile(String userEmail, String userName) {
            this.userEmail = userEmail;
            this.userName = userName;
        }
        public String getUserEmail() {
            return userEmail;
        }

        public void setUserEmail(String userEmail) {
            this.userEmail = userEmail;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }


    }

