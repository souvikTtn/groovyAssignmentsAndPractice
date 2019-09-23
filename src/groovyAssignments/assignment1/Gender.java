package groovyAssignments.assignment1;

public enum Gender {
    MALE("male"),FEMALE("female"),OTHER("other");
    private String value;
    Gender(String value){
        this.value=value;
    }
}