class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{ constraints {
				// apply constraints here
			} }
		"/accessDenied"(view:"/login/denied")
		"/popuphandler"(view:"/popupHandler")
		"/"(view:"/index")
		"500"(view:'/error')
	}
}
