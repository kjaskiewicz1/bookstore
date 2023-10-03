package Bookstore.Bookstore.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "employees")
public class Employee {

        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        @Column
        private int id;
        @Column
        private String firstName;
        @Column
        private String lastName;
        @Column
        private String department;
        @Column
        private int departmentid;

        public Employee() {
        }

        public Employee(int id, String firstName, String lastName, String department, int departmentid) {
                this.id = id;
                this.firstName = firstName;
                this.lastName = lastName;
                this.department = department;
                this.departmentid = departmentid;
        }


        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getDepartment() {
                return department;
        }

        public void setDepartment(String department) {
                this.department = department;
        }

        public int getDepartmentid() {
                return departmentid;
        }

        public void setDepartmentid(int departmentid) {
                this.departmentid = departmentid;
        }

        @Override
        public String toString() {
                return "Employee{" +
                        "id=" + id +
                        ", firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", department='" + department + '\'' +
                        ", departmentid=" + departmentid +
                        '}';
        }
}
