package sportswear.sportswear.core.filter.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sportswear.sportswear.core.filter.rep.FilterRep;

@Service
@RequiredArgsConstructor
public class FilterService {

    private final FilterRep filterRep;

}
