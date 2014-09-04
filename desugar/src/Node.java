import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Node implements Visitable<Node> {
  Object data;
  private Map<String, Node> children;

  public Object data() {
    return data;
  }

  void x() {
  }

  void recursiveX() {
    x();
    for (final Node child : children.values())
      child.recursiveX();
  }

  public void accept(Visitor<Node> visitor) {
    visitor.visit(this);
    for (final Node child : children.values())
      child.accept(visitor);
  }
  
  Stream<Node> stream() {
    return new VisitorStream(this);
  }
}

interface Visitor<T> {
  void visit(T node);
  default boolean isDone(){
    return false;
  }
}

class Client {
  void run() {
    Node node = new Node();
    node.accept(n -> System.out.println(n.data));
  }
}

interface Visitable<T> {
  void accept(Visitor<T> visitor);
  default boolean isDone() {
    return false;
  }
}


class VisitorStream<T> implements Stream<T> {
  private Visitable<T> source;
  public VisitorStream(Visitable<T> source) {
    this.source = source;
  }

  public void forEach(Consumer<? super T> action) {
    this.source.accept(item -> action.accept(item));   
  }
  
  @Override
  public Iterator<T> iterator() {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public Spliterator<T> spliterator() {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public boolean isParallel() {
    // TODO Auto-generated method stub
    return false;
  }
  @Override
  public Stream<T> sequential() {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public Stream<T> parallel() {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public Stream<T> unordered() {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public Stream<T> onClose(Runnable closeHandler) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public void close() {
    // TODO Auto-generated method stub
    
  }
  @Override
  public Stream<T> filter(Predicate<? super T> predicate) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public <R> Stream<R> map(Function<? super T, ? extends R> mapper) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public IntStream mapToInt(ToIntFunction<? super T> mapper) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public LongStream mapToLong(ToLongFunction<? super T> mapper) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public DoubleStream mapToDouble(ToDoubleFunction<? super T> mapper) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public <R> Stream<R> flatMap(
      Function<? super T, ? extends Stream<? extends R>> mapper) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public IntStream flatMapToInt(Function<? super T, ? extends IntStream> mapper) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public LongStream flatMapToLong(
      Function<? super T, ? extends LongStream> mapper) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public DoubleStream flatMapToDouble(
      Function<? super T, ? extends DoubleStream> mapper) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public Stream<T> distinct() {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public Stream<T> sorted() {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public Stream<T> sorted(Comparator<? super T> comparator) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public Stream<T> peek(Consumer<? super T> action) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public Stream<T> limit(long maxSize) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public Stream<T> skip(long n) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void forEachOrdered(Consumer<? super T> action) {
    // TODO Auto-generated method stub
    
  }
  @Override
  public Object[] toArray() {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public <A> A[] toArray(IntFunction<A[]> generator) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public T reduce(T identity, BinaryOperator<T> accumulator) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public Optional<T> reduce(BinaryOperator<T> accumulator) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public <U> U reduce(U identity, BiFunction<U, ? super T, U> accumulator,
      BinaryOperator<U> combiner) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public <R> R collect(Supplier<R> supplier,
      BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public <R, A> R collect(Collector<? super T, A, R> collector) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public Optional<T> min(Comparator<? super T> comparator) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public Optional<T> max(Comparator<? super T> comparator) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public long count() {
    // TODO Auto-generated method stub
    return 0;
  }
  @Override
  public boolean anyMatch(Predicate<? super T> predicate) {
    // TODO Auto-generated method stub
    return false;
  }
  @Override
  public boolean allMatch(Predicate<? super T> predicate) {
    // TODO Auto-generated method stub
    return false;
  }
  @Override
  public boolean noneMatch(Predicate<? super T> predicate) {
    // TODO Auto-generated method stub
    return false;
  }
  @Override
  public Optional<T> findFirst() {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public Optional<T> findAny() {
    // TODO Auto-generated method stub
    return null;
  }
}

interface SplitVisitable<T> {
  Collection<Visitable<T>> split();
}

//underlying structure may provide optimizations
interface SortedVisitable { ... }
interface DistinctVisitable { ... }
//if not, stream to Collection and let java.util
//do the heavy lifting for us