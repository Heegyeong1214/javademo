package java023_logging.part01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
	//Test.class를 로깅하겠다는 의미
	private static final Logger log = LoggerFactory.getLogger(Test.class);
	
	public static void main(String[] args) {
		log.trace("trace message"); // 상세한 정보를 표시
		log.debug("debug message"); // 디버깅을 위한 정보를 표시
		log.info("info message"); // 정보성 로그를 표시
		log.warn( "message"); // 시스템 에러의 원인이 될 수 있는 경고성 메시지를 표시
		log.error("warnror message"); // 요청을 처리하는 중 오류가 발생한 경우 표시
	
		
	}// end main()
	
}// end class
