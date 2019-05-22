package com.example.spinerwithidandname;

public class ClassStringWithId {


        public String theName;
        public Integer theId;

        public ClassStringWithId(String theName, Integer theId) {
            this.theName = theName;
            this.theId = theId;
        }

        @Override
        public String toString() {
            return theName;
        }
}
