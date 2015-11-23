class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.${format})?"{
            constraints {
                // apply constraints here
            }
        }

    //    "/"(view:"/index")
//    "/"(view:"/login/login")
    "/"(controller:"Login" ,action:"login")

        "500"(view:'/error')
	}
}
