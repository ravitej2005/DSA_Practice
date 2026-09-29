class company {
  String companyName;
  int empNos;

  company(String companyName, int empNos) {
    this.companyName = companyName;
    this.empNos = empNos;
  }

  void setcompanyName(String companyName) {
    this.companyName = companyName;
  }

  void setempNos() {
    this.empNos = empNos;
  }

  String getcompanyName() {
    return companyName;
  }

  int getempNos() {
    return empNos;
  }

}

class employee {
  String empName;

  employee(String empName) {
    this.empName = empName;
  }

  String getempName() {
    return empName;
  }

  String getc(company coditas) {
    return coditas.getcompanyName();
  }
}

class demo {
  public static void main(String[] args) {
    company coditas = new company("capgemini", 4510);
    System.out.println("company name" + coditas.getcompanyName());
    System.out.println("company empnos" + coditas.getempNos());

    employee obj = new employee("shubham");
    System.out.println("employe name is" + obj.getempName());
    System.out.println("employe c" + obj.getc(coditas)); 

  }

}