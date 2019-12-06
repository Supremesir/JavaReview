package com.supremesir.experiment1;

/**
 * @author HaoFan Fang
 * @date 2019/12/6 15:25
 */
class GraStu1 extends Student1 {
    private String tutor;

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public void printInfo() {
        System.out.println("name:" + name + ",tutor:" + tutor);
    }
}
