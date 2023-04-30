package org.agoncal.quarkus.microservices.book;

import io.quarkus.test.Mock;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Mock
@RestClient
public class MockNumberProxy implements NumberProxy{
    @Override
    public IsnbThirteen generateIsbnNumbers() {
        IsnbThirteen isnbThirteen=new IsnbThirteen();
        isnbThirteen.isbn13="13-mock";
        return isnbThirteen;
    }
}
