package egovframework.sample.service.impl;

public class AdvancedSampleServiceImpl {
	
	public AdvancedSampleServiceImpl() throws Exception {
		System.out.println("===> AdvancedSampleServiceImpl 생성");
	}
	
	public void addSample() throws Exception {
		System.out.println("AdvancedSampleService---Sample 등록");
	}
	
	public void updateSample() throws Exception {
		System.out.println("AdvancedSampleService---Sample 수정");
	}
	
	public void removeSample() throws Exception {
		System.out.println("AdvancedSampleService---Sample 삭제");
	}
	
	public void getSample() throws Exception {
		System.out.println("AdvancedSampleService---Sample 상세 조회");
	}
	
	public void getSampleList() throws Exception {
		System.out.println("AdvancedSampleService---Sample 목록 검색");
	}
}
