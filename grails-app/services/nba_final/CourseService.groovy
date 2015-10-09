package nba_final

import grails.transaction.Transactional
import nba_vit.Course

@Transactional
class CourseService {
def dataSource

    def serviceMethod() {

    }
    def findcourses(){
        Course c = new Course()
        String query = "select courseCode from Course"
        def courselist = c.executeQuery(query)
        println("List:"+courselist)
        return courselist
    }
}
