import grails.plugins.springsecurity.Secured


class ControlPanelController {

	def htmlService
	
    @Secured(['ROLE_FACEBOOK']) 
    def poslogin = {
        render "Olá! Se você está vendo essa mensagem é porque fez o login pelo facebook!"
    }
	
	def index = {
		String url = "http://www.americanas.com.br/produto/7263112/celularesetelefones/celularesoperadoras/claro/smartphone-nokia-5233-preto-gsm-desbloqueado-claro-c/-sistema-operacional-symbian-os-9.4-touchscreen-c/-tela-de-3.2_-camera-2.0mp-c/-zoom-3x-filmadora-mp3-player-radio-fm-bluetooth-estereo-2.0-gratis-fone-e-cartao-de-2gb"
		def desc = htmlService.getMetaValue(url,"description");
		println desc
	}
	

}
