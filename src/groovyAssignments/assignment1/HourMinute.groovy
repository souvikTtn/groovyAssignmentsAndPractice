package groovyAssignments.assignment1

class HourMinute {
    Integer hours
    Integer minutes
    HourMinute plus(HourMinute hourMinute){
        HourMinute result
        result = new HourMinute()
        result.minutes=Math.abs((this.minutes+hourMinute.minutes)%60)
        result.hours=Math.abs((this.hours+hourMinute.hours)%24)
        result
    }
    HourMinute minus(HourMinute hourMinute){
        HourMinute result
        result = new HourMinute()
        result.minutes=Math.abs((this.minutes-hourMinute.minutes)%60)
        result.hours=Math.abs((this.hours-hourMinute.hours)%24)
        result
    }

    static void main(String []args){
        HourMinute hourMinute1=new HourMinute(hours: 12,minutes: 30)
        HourMinute hourMinute2=new HourMinute(hours: 12,minutes: 10)
        HourMinute addResult=hourMinute1+hourMinute2
        HourMinute subResult=hourMinute2-hourMinute1
        println addResult
        println subResult

    }

    @Override
     String toString() {
        return "HourMinute{" +
                "hours=" + hours +
                ", minutes=" + minutes

    }
}
