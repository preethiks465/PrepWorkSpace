package Transform;

import cucumber.api.Transformer;

public class EmailTransformer extends Transformer<Object> {

	@Override
	public Object transform(String value) {
		return value.concat("abc.com");
	}

}
