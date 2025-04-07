/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.sample;

import com.liferay.client.extension.util.spring.boot3.BaseRestController;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.json.JSONArray;
import org.json.JSONObject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Luca Pellizzon
 */
@RequestMapping("/options")
@RestController
public class OptionsRestController extends BaseRestController {

	@PostMapping
	public ResponseEntity<String> post(
			@AuthenticationPrincipal Jwt jwt, @RequestBody String json)
		throws Exception {

		log(jwt, _log, json);

		return new ResponseEntity<>(
			new JSONObject(
			).put(
				"shippingOptions",
				new JSONArray(
				).put(
					new JSONObject(
					).put(
						"amount", 13.90
					).put(
						"key", "CXOption1"
					).put(
						"name", "CXOption1"
					).put(
						"priority", 1
					)
				).put(
					new JSONObject(
					).put(
						"amount", 15.99
					).put(
						"key", "CXOption2"
					).put(
						"name", "CXOption2"
					).put(
						"priority", 2
					)
				).put(
					new JSONObject(
					).put(
						"amount", 17.50
					).put(
						"key", "CXOption3"
					).put(
						"name", "CXOption3"
					).put(
						"priority", 3
					)
				)
			).toString(),
			HttpStatus.OK);
	}

	private static final Log _log = LogFactory.getLog(
		OptionsRestController.class);

}