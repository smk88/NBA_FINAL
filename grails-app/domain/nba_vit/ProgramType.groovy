package nba_vit

class ProgramType {
    String program_type
    static belongsTo=[institute:Institute]
     String toString()
    {
        program_type
    }
    static constraints = {
    }
}
