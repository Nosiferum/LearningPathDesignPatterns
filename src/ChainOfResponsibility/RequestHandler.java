package ChainOfResponsibility;

public interface RequestHandler {
  boolean canHandleRequest(Request request);
  int getPriority();
  void handle(Request request);
  String name();
}
