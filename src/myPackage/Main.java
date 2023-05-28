package myPackage;

public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        st.createDatabase();
        st.createTable();
        // CRUD
        // create data
        st.createData();
        // read data
        st.readData();
        // update data
        st.updateData();

        // delete data
        st.deleteData();

    }
}
