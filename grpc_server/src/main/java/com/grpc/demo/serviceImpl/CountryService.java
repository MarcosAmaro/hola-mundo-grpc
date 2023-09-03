package com.grpc.demo.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import com.grpc.demo.mapper.CountryMapper;
import com.grpc.demo.model.Country;
import com.grpc.demo.repository.ICountryRepository;
import com.grpc.demo.service.CountryServiceClass.CountryDTO;
import com.grpc.demo.service.CountryServiceClass.CountryListResponse;
import com.grpc.demo.service.CountryServiceClass.Empty;
import com.grpc.demo.service.CountryServiceGrpc.CountryServiceImplBase;

import io.grpc.stub.StreamObserver;

@GRpcService
public class CountryService extends CountryServiceImplBase {

	@Autowired
	ICountryRepository countryRepository;
	
	CountryMapper cm = new CountryMapper();
	
	@Override
	public void getList(Empty request, StreamObserver<CountryListResponse> responseObserver) {
		List<Country> lstCountries = countryRepository.findAllByNationalDayNullOrCountryCodeMainNull();
		CountryListResponse cr = CountryListResponse.newBuilder()
				.addAllCountries(lstCountries.stream().map(x -> cm.toDTO(x))
				.collect(Collectors.toList())).build();
		responseObserver.onNext(cr);
		responseObserver.onCompleted();
	}
	
	@Override
	public void updateCountry(CountryDTO request, StreamObserver<Empty> responseObserver) {
		countryRepository.save(cm.toModel(request));
		responseObserver.onNext(Empty.newBuilder().build());
		responseObserver.onCompleted();
	}
}
