package pl.twojadruzyna.converter;

public interface IConverter <T,U> {

    U convertToViewModel(T entity);

    T convertToEntity(U viewModel);
}
