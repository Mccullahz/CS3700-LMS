/*
 * @author Zylar :)
 */
package application;
// this class is used to differentiate between different conference paper periods. ie this will store a begin and an end date
public class Period {
    public String beginDate;
    public String endDate;

    public Period(String beginDate, String endDate) {
        this.beginDate = beginDate;
        this.endDate = endDate;
    }
}