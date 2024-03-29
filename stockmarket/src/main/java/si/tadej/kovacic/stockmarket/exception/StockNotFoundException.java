package si.tadej.kovacic.stockmarket.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Stock Not Found")
public class StockNotFoundException extends RuntimeException {

}
