//package com.rest_api.fs14backend.utils;
//
//import com.rest_api.fs14backend.user.User;
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Service;
//
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.function.Function;
//
//@Service
//public class JwtUtils {
//  final String secret = "ThisIsAMuchLongerPasswordOhBoysDoINeedMoreCharacters";
//
//  // secret variable to be moved to .env
//  public String generateToken(User user) {
//    Map<String, Object> claims = new HashMap<>();
//    claims.put("user_id", user.getId());
//    claims.put("username", user.getUsername());
//
//    return createToken(claims, user.getUsername());
//  }
//
//  private String createToken(Map<String, Object> claims, String subject) {
//    return Jwts
//      .builder()
//      .setClaims(claims)
//      .setSubject(subject)
//      .setIssuedAt(new Date(System.currentTimeMillis()))
//      .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
//      .signWith(SignatureAlgorithm.HS256, secret).compact();
//
//  }
//
//  public String extractUsername(String token) {
//    return extractClaim(token, Claims::getSubject);
//  }
//
//  public Date extractExpiration(String token) {
//    return extractClaim(token, Claims::getExpiration);
//  }
//
//  public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
//    final Claims claims = extractAllClaims(token);
//    return claimsResolver.apply(claims);
//  }
//
//  private Claims extractAllClaims(String token) {
//    return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
//  }
//
//  private Boolean isTokenExpired(String token) {
//    return extractExpiration(token).before(new Date());
//  }
//
//  public Boolean validateToken(String token, UserDetails userDetails) {
//    final String username = extractUsername(token);
//    return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
//  }
//}
