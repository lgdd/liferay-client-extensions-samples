/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.sample;

import com.liferay.client.extension.util.spring.boot3.BaseRestController;

import java.util.Collections;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * @author Raymond Augé
 * @author Gregory Amerson
 * @author Brian Wing Shun Chan
 */
@RequestMapping("/dad/joke")
@RestController
public class DadJokeRestController extends BaseRestController {

	@GetMapping
	public ResponseEntity<String> get(@AuthenticationPrincipal Jwt jwt) {
		log(jwt, _log);

		String dadJoke = get(
			Collections.singletonMap(
				HttpHeaders.ACCEPT, MediaType.TEXT_PLAIN_VALUE),
			UriComponentsBuilder.fromUriString(
				"https://icanhazdadjoke.com"
			).build(
			).toUri());

		if (_log.isInfoEnabled()) {
			_log.info("Dad joke: " + dadJoke);
		}

		return new ResponseEntity<>(dadJoke, HttpStatus.OK);
	}

	private static final Log _log = LogFactory.getLog(
		DadJokeRestController.class);

}