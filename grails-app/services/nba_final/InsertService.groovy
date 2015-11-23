package nba_final

import grails.transaction.Transactional
import nba_vit.PO
import nba_vit.Program

@Transactional
class InsertService {

    def serviceMethod() {

    }
    def insertPO(String po_code, String po_statement, Program program, String is_lock, String is_current, String revision_year )
    {
        println("Now inserting PO")
        PO newpo = new PO()
        newpo.po_code = po_code
        newpo.po_statement = po_statement
        newpo.program = program
        newpo.revision_year = revision_year
        def res = newpo.save(flush: true, failOnError: true)  
        println("res="+res)     
//        def result = [:]
//        result['success']="record inserted"

        
    }
}
