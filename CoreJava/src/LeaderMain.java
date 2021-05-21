public class LeaderMain {

	public static void main(String[] args) {
		
		Leader leader=new Leader();
		
		leader.setLeaderId(677676);
		leader.setLeaderName("amar kumar");
		leader.setLeaderAge(40);
		
		Speech speech=new Speech();
		speech.setSpeechId(1);
		speech.setSpeechName("corruption");
		speech.setSpeechDuration(40);

		leader.setSpeech(speech);
		
		System.out.println("Leader Information");
		System.out.println("Id "+leader.getLeaderId());
		System.out.println("Name "+leader.getLeaderName());
		System.out.println("Age "+leader.getLeaderAge());

		Speech speech2=leader.getSpeech();
		
		 System.out.println("\tLeader speech ");
		 System.out.println("\t\tSpeech Id   "+speech2.getSpeechId());
		 System.out.println("\t\tSpeech Name   "+speech2.getSpeechName());
		 System.out.println("\t\tSpeech Duration "+speech2.getSpeechDuration());
	
	}
}
