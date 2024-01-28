package ChainOfResponsibility;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OrcKing {

  private final List<RequestHandler> handlers;

  public OrcKing() {
    handlers = Arrays.asList(new OrcCommander(), new OrcOfficer(), new OrcSoldier());
  }

  public void makeRequest(Request request) {
    handlers
        .stream()
        .sorted(Comparator.comparing(RequestHandler::getPriority))
        .filter(handler -> handler.canHandleRequest(request))
        .findFirst()
        .ifPresent(handler -> handler.handle(request));
  }
}
