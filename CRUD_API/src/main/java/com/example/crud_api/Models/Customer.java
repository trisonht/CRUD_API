package com.example.crud_api.Models;

import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;

@Entity
@Table(name="customers")
public class Customer {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)

        @Column(name = "id")
        private Long id;

        @Column(name = "first_name")
        private String first_name;

        @Column(name = "last_name")
        private String last_name;

        @Column(name = "email")
        private String email;

        public Customer() {
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getFirst_name() {
                return first_name;
        }

        public void setFirst_name(String first_name) {
                this.first_name = first_name;
        }

        public String getLast_name() {
                return last_name;
        }

        public void setLast_name(String last_name) {
                this.last_name = last_name;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public Customer(Long id, String first_name, String last_name, String email) {
                this.id = id;
                this.first_name = first_name;
                this.last_name = last_name;
                this.email = email;
        }
}
