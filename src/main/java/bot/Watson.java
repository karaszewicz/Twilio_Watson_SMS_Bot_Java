package bot;

import com.ibm.watson.developer_cloud.assistant.v1.Assistant;
import com.ibm.watson.developer_cloud.assistant.v1.model.InputData;
import com.ibm.watson.developer_cloud.assistant.v1.model.MessageOptions;
import com.ibm.watson.developer_cloud.assistant.v1.model.MessageResponse;

public class Watson {
	private final String username = "your workspace username";
	private final String password = "your workspace password";
	private final String workspaceId = "your workspace id";

	public String sendToBot(String message){
		Assistant service = new Assistant("2018-02-16");
		service.setUsernameAndPassword(username,password);

		InputData input = new InputData.Builder(message).build();
		MessageOptions options = new MessageOptions.Builder(workspaceId )
		  .input(input)
		  .build();
		MessageResponse response = service.message(options).execute();
		return response.getOutput().getText().get(0);
	}	
}
