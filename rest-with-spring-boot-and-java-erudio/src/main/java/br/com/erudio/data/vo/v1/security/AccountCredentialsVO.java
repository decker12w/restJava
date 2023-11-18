package br.com.erudio.data.vo.v1.security;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class AccountCredentialsVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String username;
	private String password;

}