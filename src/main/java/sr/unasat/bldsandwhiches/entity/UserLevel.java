package sr.unasat.bldsandwhiches.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



    @Entity
    public class UserLevel {
        @Id
        @GeneratedValue
        private Long id;
        private String role;

        public UserLevel(String role) {
            this.role = role;
        }

        public UserLevel () { }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }


        @Override
        public String toString() {
            return "UserLevel{" +
                    "id=" + id +
                    ", role='" + role + '\'' +
                    '}';
        }
    }

