function fn() {
	var env = karate.env; // getSystem.property
	karate.log('karate.env value:', env);

	if (!env) {
		env = 'scrum'
	}

	var config = {
		env: env,
		username: '',
		password: '',
		auth_valid: '',
		auth_invalid: '',
		baseUrl: '',
		findAPI: '',
		find_allAPI: '',
		addAPI: '',
		removeAPI: '',
		updateAPI: '',
		detailsAPI: ''
	}
	if (env == 'scrum') {
		config.username = 'admin',
			config.password = 'welcome',
			config.auth_valid = 'Basic YWRtaW46d2VsY29tZQ==',
			config.auth_invalid = 'Basic INVALIDYWRtaW46d2VsY29tZQ==',
			config.baseUrl = 'http://jobportalkarate.herokuapp.com',
			config.findAPI = '/secure/webapi/find',
			config.find_allAPI = '/secure/webapi/all',
			config.addAPI = '/secure/webapi/add',
			config.removeAPI = '/secure/webapi/remove/',
			config.updateAPI = '/secure/webapi/update',
			config.detailsAPI = '/secure/webapi/update/details'
	} else if (env = 'sit') {
		config.username = 'admin',
			config.password = 'welcome',
			config.baseUrl = 'https://jobportalkarate.herokuapp.com',
			config.findAPI = '/normal/webapi/find',
			config.find_allAPI = '/normal/webapi/all',
			config.addAPI = '/normal/webapi/add',
			config.removeAPI = '/normal/webapi/remove/',
			config.updateAPI = '/normal/webapi/update',
			config.detailsAPI = '/normal/webapi/update/details'
	}
	return config;
}