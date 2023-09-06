public class Student {
    private String _name;
    private int age;
    private int psp;
    private String address;
    private String email;
    private Student(Builder b){
        this._name=b.name;
        this.age=b.age;
        this.psp=b.psp;
        this.address=b.address;
        this.email=b.email;
    }

    public static class Builder{
        private String name;
        public Builder setName(String _name) {
            this.name = _name;
            return this;
        }
        private int age;
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        private int psp;
        public Builder setPSP(int psp) {
            this.psp = psp;
            return this;
        }
        private String address;
        public Builder setAddress(String addr) {
            this.address = addr;
            return this;
        }
        private String email;
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Student CreateBuilder(){
            if(this.age<18){
                throw new RuntimeException("Age can't be lesser than 18");
            }
            if(this.psp<0 || this.psp>100){
                throw new RuntimeException("PSP can't be negative or greater than 100");
            }
            return new Student(this);
        }
    }
}
